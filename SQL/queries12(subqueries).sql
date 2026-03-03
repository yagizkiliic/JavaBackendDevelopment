

--film tablosunda film uzunluğu length sütununda gösterilmektedir. Uzunluğu ortalama film uzunluğundan fazla kaç tane film vardır?

select count(*) from film
where length >
(
select AVG(length) from film
);


--film tablosunda en yüksek rental_rate değerine sahip kaç tane film vardır?

select count(*) from film
where rental_rate = 
(
select MAX(rental_rate) from film
);

--film tablosunda en düşük rental_rate ve en düşük replacement_cost değerlerine sahip filmleri sıralayınız.

select * from film
where rental_rate = (select MIN(rental_rate) from film) and replacement_cost = (select MIN(replacement_cost) from film);


--payment tablosunda en fazla sayıda alışveriş yapan müşterileri(customer) sıralayınız.

 select customer.first_name,customer.last_name from customer 
 join payment on customer.customer_id = payment.customer_id 
 where amount = 
 (
 select MAX(amount) from payment
 );