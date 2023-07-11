insert into Brand (id, name) values (1,'Zara');


insert into PRICES (id,START_DATE,END_DATE,PRICE_LIST,PRODUCT_ID,PRIORITY,PRICE,CURR,brand_id) values
                                                                                                   (1,PARSEDATETIME('2020-06-14-00.00.00','yyyy-MM-dd-HH.mm.ss'),PARSEDATETIME('2020-12-31-23.59.59','yyyy-MM-dd-HH.mm.ss'),1,35455,0,35.50,'EUR',1),
                                                                                                   (2,PARSEDATETIME('2020-06-14-15.00.00','yyyy-MM-dd-HH.mm.ss'),PARSEDATETIME('2020-06-14-18.30.00','yyyy-MM-dd-HH.mm.ss'),2,35455,1,25.45,'EUR',1),
                                                                                                   (3,PARSEDATETIME('2020-06-15-00.00.00','yyyy-MM-dd-HH.mm.ss'),PARSEDATETIME('2020-06-15-11.00.00','yyyy-MM-dd-HH.mm.ss'),3,35455,1,30.50,'EUR',1),
                                                                                                   (4,PARSEDATETIME('2020-06-15-16.00.00','yyyy-MM-dd-HH.mm.ss'),PARSEDATETIME('2020-12-31-23.59.59','yyyy-MM-dd-HH.mm.ss'),4,35455,1,38.95,'EUR',1);