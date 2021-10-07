select product_name from netology.ORDERS
                             join netology.CUSTOMERS on netology.CUSTOMERS.id = netology.ORDERS.customer_id
where UPPER(netology.customers.name) LIKE UPPER (:name);