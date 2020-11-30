select partner_id,partner_name,phone_no from delivery_partners
where rating>=3 and rating<=5
order by partner_id;