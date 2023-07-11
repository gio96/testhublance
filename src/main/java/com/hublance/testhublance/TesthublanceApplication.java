package com.hublance.testhublance;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TesthublanceApplication /*implements CommandLineRunner*/ {

//    @Autowired
//    BrandRepositoryDataAdapter brandRepositoryDataAdapter;

    public static void main(String[] args) {
        SpringApplication.run(TesthublanceApplication.class, args);
    }

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

    @Bean
    public ObjectMapper objectMapper(){
        return new ObjectMapper();
    }

//    @Override
//    public void run(String... args) throws Exception {
//        var brand = new Brand("Zara");
//
////        var preciosList = new ArrayList<Price>();
//
//        var pr1 = new Price(2.5,"EUR");
//        var pr2 = new Price(2.5,"EUR");
//
//        pr1.setBrandId(brand);
//        pr2.setBrandId(brand);
//
//        //brand.getPrice().addAll(List.of(pr1, pr2));
//
////        preciosList.add(pr1);
////        preciosList.add(pr2);
//
//        brand.setPrice(List.of(pr1, pr2));
//       // brand.setPrice(preciosList);
//
//
//        brandRepositoryDataAdapter.save(brand);
//
//        var re = brandRepositoryDataAdapter.findAll();
//
//        for (Brand br : re) {
//            System.out.println(br.getId());
//        }
//
////        var brand = Brand.builder().name("Zara").build();
////
////        var preciosList = new ArrayList<Price>();
////
////        var pr1 = Price.builder().price(2.5).curr("EUR").brandId(brand).build();
////        var pr2 = Price.builder().price(5.5).curr("EUR").brandId(brand).build();
////
////        preciosList.add(pr1);
////        preciosList.add(pr2);
////
////        brand.setPrice(preciosList);
////
////        brandRepositoryDataAdapter.save(brand);
//
//    }
}
