INSERT INTO public.ingredient VALUES (1, 'Pan brioche');
INSERT INTO public.ingredient VALUES (2, 'Carne vacuna');
INSERT INTO public.ingredient VALUES (3, 'Bacon');
INSERT INTO public.ingredient VALUES (4, 'Lechuga');
INSERT INTO public.ingredient VALUES (5, 'Tomate');

INSERT INTO public.menu VALUES (1, 'Hamburguesa normal', 'Hamburguesa a la parrila simple', 1);

INSERT INTO public.menu_ingredient VALUES (1, 1);
INSERT INTO public.menu_ingredient VALUES (1, 2);
INSERT INTO public.menu_ingredient VALUES (1, 3);
INSERT INTO public.menu_ingredient VALUES (1, 4);
INSERT INTO public.menu_ingredient VALUES (1, 5);

INSERT INTO public.menu_type VALUES (1, 'Principal');
INSERT INTO public.menu_type VALUES (2, 'Entrada');

INSERT INTO public.price_table VALUES (1, 1, 20000, 'GS', '2024-05-31');
