create database bancoweb;
use bancoweb;

    create table Cliente(
        CliDoc int not null,
        CliNom varchar(15) not null,
        CliApe varchar(15)not null,
        CliTel varchar (10) not null,
        CliCorr varchar (30) not null,
        CliTipo varchar (4) not null,
        CliDir varchar(40) not null,
        CliFecha date not null,
        primary key (CliDoc)
    );

    create table Usuario(
        UsuCliDoc int not null,
        UsuNom varchar(15)not null,
        UsuClave varchar(20)not null,
        UsuRoot varchar(2) not null,
        primary key (UsuCliDoc),
        constraint Usuario_Cliente foreign key (UsuCliDoc) references Cliente(CliDoc) on delete cascade on update cascade
    );

    create table LineaCredito(
        LCCodLinea int not null,
        LCNomLinea varchar(25) not null,
        LCMontMax int (30) not null,
        primary key (LCCodLinea)
    );

    create table CreditoCliente(
        CreCliDoc int not null,
        CreCodLinea int not null,
        CreFechDes date not null,
        CreMont int (30) not null,
        primary key(CreCliDoc,CreCodLinea),
        constraint CreditoCliente_Cliente foreign key (CreCliDoc) references Cliente(CliDoc) on delete cascade on update cascade,
        constraint CreditoCliente_LineaCredito foreign key (CreCodLinea) references LineaCredito(LCCodLinea) on delete cascade on update cascade
    );

    insert into Cliente values (1144055214,"Tefa","Zapata","3017353382","tefaz.n@gmail.com","CC","calle 13","1992-06-01");
    insert into Cliente values (1070990974,"Emiliano","Vargas","3166425754","emiliozv@gmail.com","CC","El Eco","2018-05-31");
    insert into Cliente values (35533112,"Pati","Sarmiento","3182358311","patsarm@gmail.com","CC","calle 9","1978-09-03");
    insert into Cliente values (2120263223,"Nicole","Cooper","3138141393","nicolecoop@gmail.com","CC","Los angeles 9 west street","1996-04-17");
    
    insert into Usuario values (1144055214,"tefa","tefasmile","Si");
    insert into Usuario values (1070990974,"emiliano","bb2018","No");
    insert into Usuario values (35533112,"pati","lunazul","No");
    insert into Usuario values (2120263223,"Nicole","cooper","No");
    
    insert into LineaCredito values (001,"Microcredito",15000000);
    insert into LineaCredito values (002,"Hipotecario",30000000);
    insert into LineaCredito values (003,"Consumo",10000000);
    insert into LineaCredito values (004,"Comercial",25000000);
    
    insert into CreditoCliente values (1144055214,002,"1992-06-01",20000000);
    insert into CreditoCliente values (1070990974,003,"2018-05-31",8000000);
    insert into CreditoCliente values (35533112,001,"1978-09-03",14000000);
    insert into CreditoCliente values (2120263223,001,"1996-04-17",12000000);