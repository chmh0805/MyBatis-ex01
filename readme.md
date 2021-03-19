## MyBatis DB 설정

### Table 생성
- sale 테이블은 JOIN 연습을 위한 테이블
- productId가 존재하는 번호를 입력해야함

```sql
create table product(
	id int primary key auto_increment,
    name varchar(100),
    code varchar(100)
);

create table sale(
	id int primary key auto_increment,
    productId int,
    username varchar(30)
);

INSERT INTO sale(productId, username) VALUES (2, '홍길동');
```
