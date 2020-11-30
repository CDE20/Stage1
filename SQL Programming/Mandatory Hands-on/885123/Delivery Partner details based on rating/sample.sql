select partner_id,partner_name,phone_no FRom delivery_partners
where rating>=3 And rating<=5
order by partner_id;