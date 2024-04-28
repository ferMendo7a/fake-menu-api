CREATE IF NOT EXISTS TABLE public.menu_type (
	menu_type_id serial NOT NULL,
	name varchar(100) NOT NULL,
	CONSTRAINT menu_type_pk PRIMARY KEY (menu_type_id),
	CONSTRAINT uk_menu_type_name UNIQUE ("name")
);

CREATE TABLE public.ingredient (
	ingredient_id serial NOT NULL,
	"name" varchar(200) NOT NULL,
	CONSTRAINT ingredient_pk PRIMARY KEY (ingredient_id),
	CONSTRAINT ingredient_unique UNIQUE ("name")
);

CREATE TABLE public.menu (
	menu_id serial NOT NULL,
	title varchar(100) NOT NULL,
	description varchar(1000) NULL,
	menu_type_id bigint NOT NULL,
	CONSTRAINT menu_pk PRIMARY KEY (menu_id),
	CONSTRAINT uk_menu_title UNIQUE (title),
	CONSTRAINT fk_menu_menu_type FOREIGN KEY (menu_type_id) REFERENCES public.menu_type(menu_type_id)
);

CREATE TABLE public.price_table (
	price_table_id serial NOT NULL,
	menu_id bigint NOT NULL,
	price double precision NOT NULL,
	currency varchar(5) NOT NULL,
	validity_date date NOT NULL,
	CONSTRAINT pk_price_table PRIMARY KEY (price_table_id),
	CONSTRAINT price_table_menu_fk FOREIGN KEY (menu_id) REFERENCES public.menu(menu_id)
);

CREATE TABLE public.menu_ingredient (
	menu_id bigint NOT NULL,
	ingredient_id bigint NOT NULL,
	CONSTRAINT menu_ingredient_pk PRIMARY KEY (menu_id,ingredient_id)
);
