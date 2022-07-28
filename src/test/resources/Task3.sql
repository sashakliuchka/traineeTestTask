SELECT promo_orders/total_orders * 100

FROM
    (SELECT COUNT(*) from orders) total_orders,
    (SELECT COUNT(*) from orders WHERE promocode_id NOT NULL ) promo_orders;