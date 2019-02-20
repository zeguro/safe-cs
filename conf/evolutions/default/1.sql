# --- !Ups
create table safe_cs(id bigserial primary key, ts timestamp default now(), score double precision not null);

# --- !Downs
drop table safe_cs;
