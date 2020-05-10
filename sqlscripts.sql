
-- CREATE TABLE PRODUCT--
CREATE TABLE public.product
(
    id bigint NOT NULL,
    item character varying(200) COLLATE pg_catalog."default",
    description character varying(1000) COLLATE pg_catalog."default",
    price double precision,
    CONSTRAINT product_pkey PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.product
    OWNER to postgres;

-- INSERT SCRIPTS
INSERT INTO product(id, item, description,price)VALUES(1,'ROLEX watch','Rolex ',1200); COMMIT;

INSERT INTO product(id, item, description,price)VALUES(2,'Sony Headphone','Sony MDR-XB450 Headphone',450); COMMIT;

INSERT INTO product(id, item, description,price)VALUES(3,'Mixer Grinder','Philips AquaTouch S5050/06 Mixer Grinder',5500); COMMIT;

INSERT INTO product(id, item, description,price)VALUES(4,'Flip Phone','I Kall K3312 Grey Flip Phone',516);	COMMIT;

INSERT INTO product(id, item, description,price)VALUES(5,'Iron Box','Bajaj Majesty Dry Iron',600);	COMMIT;

INSERT INTO product(id, item, description,price)VALUES(6,'Table Fan','Bajaj MIDIEA BT-07 400MM 400 mm 3 Blade Table Fan',1900);  COMMIT;

INSERT INTO product(id, item, description,price)VALUES(7,'Compact Refrigerator','Troopicol Compact Refrigerator',20000); COMMIT;

INSERT INTO product(id, item, description,price)VALUES(8,'Dell Inspirion','Dell Inspiron 3567 Intel Core i3 7th Gen 15.6-inch FHD Laptop (4GB/1TB HDD/Windows 10 Home + MS Office/Black/2.5kg',27999); COMMIT;

INSERT INTO product(id, item, description,price)VALUES(9,'Fan','Fan',1200); COMMIT;

