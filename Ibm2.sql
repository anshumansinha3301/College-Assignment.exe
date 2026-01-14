SELECT
    name,
    '2024-04-10' AS today_date,
    DATE(next_renewal_date) AS next_renewal_date,
    DATEDIFF(DATE(next_renewal_date), '2024-04-10') AS days_until_renewal
FROM domains
ORDER BY days_until_renewal ASC, name ASC;
