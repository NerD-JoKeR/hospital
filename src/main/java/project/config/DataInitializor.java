package project.config;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.stereotype.Component;

/**
 * Created by JoKeR on 19.01.2017.
 */
@Component
public class DataInitializor {

    public void init() {
        // TODO создать в POSTGRES crud и  заполнить его PERSONS , DEPARTMENTS, WORKTIME ТАБЛИЦЫ

        System.out.println("filling tables");

        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        dataSource.setDriverClass(org.postgresql.Driver.class);
        dataSource.setUsername("postgres");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/hospital");
        dataSource.setPassword("root");


        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);


        // ("CREATE TABLE departments (id serial, name varchar(256),PRIMARY KEY (id))");
        jdbcTemplate.update("INSERT INTO departments(id, name) values ('1', 'Отделение специализированной помощи')");
        jdbcTemplate.update("INSERT INTO departments(id, name) values ('2', 'Отделение участковых педиаторов')");
        jdbcTemplate.update("INSERT INTO departments(id, name) values ('3', 'Отделение семейно медицины')");
        jdbcTemplate.update("INSERT INTO departments(id, name) values ('4', 'Отделение гинекологии')");


        //("CREATE TABLE persons (id serial, cabinet INTEGER , name_inic varchar(256), position varchar(256), district varchar(256), department_id INTEGER , PRIMARY KEY (id) )");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('1', '0', 'Амантулиева Г.И', 'Отоларинголог', ' ', '1')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('2', '0', 'Асланов М.М', 'Хирург', ' ', '1')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('3', '0', 'Ильясов С .К', 'Хирург', ' ', '1')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('4', '0', 'Бурибаев М.С', 'Травматолог', ' ', '1')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('5', '0', 'Сарсекенова С.Ж', 'Хирург', ' ', '1')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('6', '0', 'Байжуманова О.С', 'Офтальмолог',  ' ', '1')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('7', '0', 'Жамабалина Ж.А', 'Офтальмолог',  ' ', '1')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('8', '0', 'Мустафина Т.М', 'Инфекционист',  ' ', '1')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('9', '0', 'Самалдыкова М.Х', 'Эндокринолог',  ' ', '1')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('10', '0', 'Сайдильдаева Ж.А', 'Невропатолог',  ' ', '1')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('11', '0', 'Койко Н.А', 'Невропатолог',  ' ', '1')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('12', '0', 'Ахметов Ш.А', 'Невропатолог',  ' ', '1')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('13', '0', 'Нурпеисова Жазира', 'Невропатолог платное отд',  ' ', '1')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('14', '0', 'Орынбаева Акмарал', 'Невропатолог',  ' ', '1')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('15', '0', 'Сарсекенов С.Ж', 'Кардиолог',  ' ', '1')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('16', '0', 'Абдраимова Р.К', 'Кардиолог',  ' ', '1')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('17', '0', 'Жахметова А.Р', 'Дерматолог',  ' ', '1')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('18', '0', 'Надирова К.А', 'ВОП 5 уч',  '5', '2')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('19', '0', 'Абуова К.Т', 'ВОП 26 уч',  '26', '2')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('20', '0', 'Башарова В.Н', 'ВОП 3 уч', '3', '2')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('21', '0', 'Темергалиев К.Т', 'ВОП уч 35', '35', '2')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('22', '0', 'Спатаева А.А', 'ВОП', '1', '2')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('23', '0', 'Рахметова Б.А', 'ВОП 7 уч', '7', '2')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('24', '0', 'Арнханова К.М', 'ВОП 2 уч', '2', '3')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('25', '0', 'Боранбаева К.С', 'ВОП 6, 14 уч', '6,14', '3')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('26', '0', 'Алимбекова Ж.К', 'ВОП 29 уч', '29', '3')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('27', '0', 'Наршанова К.Ш', 'ВОП 20 уч', '20', '3')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('28', '0', 'Утебаева Г.А', 'ВОП 8 уч', '8', '3')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('29', '0', 'Акимбаева А.Б', 'ВОП 15, 9 уч', '15,9', '3')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('30', '0', 'Темирбек Г', 'ВОП 36 уч', '36', '3')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('31', '0', 'Рысбекова Г.М', 'Зав ж/к', ' ', '4')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('32', '0', 'Рысбекова Г.М', 'Врач УЗИ',' ', '4')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('33', '0', 'Анарбаева Б.А', 'Врач ак - гин', ' ', '4')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('34', '0', 'Алпысбаева Н.К', 'Врач ак - гин', ' ', '4')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('35', '0', 'Идияева Ж', 'Врач ак - гин', ' ', '4')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('36', '0', 'Манекеева С.М', 'Врач ак - гин', ' ', '4')");
        jdbcTemplate.update("INSERT INTO persons(id, cabinet, name_inic, position, district, department_id) values ('37', '0', 'Утегенова А.Б', 'Врач ак - гин', ' ', '4')");


        //("CREATE TABLE work_time (id serial, day1 varchar(256), day2 varchar(256), day3 varchar(256), day4 varchar(256), day5 varchar(256), day6 varchar(256), day7 varchar(256), person_id INTEGER , department_id INTEGER, in PRIMARY KEY (id))");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('1', '14:00-17:00', '14:00-17:00', '13:00- 17:00', '14:00-17:00', '14:00-17:00', '', '', '1', '1')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('2', '', '', '08:00-13:00', '08:00-13:00', '08:00-13:00', '', '', '2', '1')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('3', '08:00-17:00', '08:00-17:00', '', '', '', '', '', '3', '1')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('4', '', '', '14:00-17:00', '', '14:00-17:00', '', '', '4', '1')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('5', '08:00-13:00', '08:00-13:00', '', '08:00-13:00', '', '', '', '5', '1')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('6', '', '', '08:00-13:00', '08:00-13:00', '08:00-13:00', '', '', '6', '1')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('7', '', '', '', '', '', '09:00-13:00', '', '7', '1')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('8', '08:00-14:30', '08:00-14:30', '08:00-14:30', '08:00-14:30', '08:00-14:30', '', '', '8', '1')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('9', '', '', '', '', '', '13:00-16:00', '09:00-14:00', '9', '1')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('10', '', '', '', '', '', '08:00-13:00', '', '10', '1')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('11', '', '', '', '', '08:00-13:00', '', '', '11', '1')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('12', '17:00-20:00', '17:00-20:00', '', '', '17:00-20:00', '', '', '12', '1')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('13', '', '', '15:00-17:00', '', '15:00-17:00', '', '', '13', '1')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('14', '09:00-12:00', '09:00-12:00', '', '09:00-12:00', '', '', '', '14', '1')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('15', '', '', '15:00-18:00', '', '15:00-18:00', '', '', '15', '1')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('16', '13:00-17:00', '13:00-17:00', '08:00-13:00', '', '08:00-13:00', '', '', '16', '1')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('17', '', '', '13:00-18:00', '15:00-20:00', '13:00-18:00', '', '', '17', '1')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('18', '08:00-13:00', '08:00-13:00', '08:00-13:00', '08:00-13:00', '13:00-18:00', '', '', '18', '2')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('19', '13:00-18:00', '13:00-18:00', '08:00-13:00', '15:00-20:00', '13:00-18:00', '', '', '19', '2')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('20', '13:00-18:00', '13:00-18:00', '15:00-20:00', '08:00-13:00', '15:00-20:00', '', '', '20', '2')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('21', '08:00-13:00', '08:00-13:00', '08:00-13:00', '08:00-13:00', '08:00-13:00', '', '', '21', '2')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('22', '15:00-20:00', '15:00-20:00', '13:00-18:00', '13:00-18:00', '08:00-13:00', '', '', '22', '2')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('23', '15:00-20:00', '15:00-20:00', '08:00-13:00', '15:00-20:00', '08:00-13:00', '', '', '23', '2')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('24', '13:00-18:00', '13:00-18:00', '08:00-13:00', '13:00-18:00', '08:00-13:00', '', '', '24', '3')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('25', '13:00-20:00', '13:00-20:00', '08:00-13:00', '13:00-18:00', '13:00-18:00', '', '', '25', '3')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('26', '15:00-20:00', '15:00-20:00', '13:00-18:00', '08:00-13:00', '13:00-18:00', '', '', '26', '3')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('27', '08:00-18:00', '08:00-18:00', '15:00-20:00', '08:00-13:00', '13:00-18:00', '', '', '27', '3')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('28', '08:00-13:00', '08:00-13:00', '13:00-18:00', '08:00-13:00', '13:00-18:00', '', '', '28', '3')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('29', '08:00-13:00', '08:00-13:00', '15:00-20:00', '13:00-18:00', '08:00-13:00', '', '', '29', '3')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('30', '08:00-13:00', '08:00-13:00', '08:00-13:00', '08:00-13:00', '08:00-13:00', '', '', '30', '3')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('31', '08:00-13:00', '08:00-13:00', '14:00-17:00', '14:00-18:00', '14:00-18:00', '', '', '31', '4')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('32', '14:00-17:00', '14:00-17:00', '13:00-18:00', '08:00-13:00', '13-00-18:00', '', '', '32', '4')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('33', '08:00-13:00', '08:00-13:00', '14:00-17:00', '08:00-13:00', '14:00-18:00', '', '', '33', '4')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('34', '08:00-13:00', '08:00-13:00', '14:00-17:00', '08:00-13:00', '14:00-18:00', '', '', '34', '4')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('35', '13:00-18:00', '13:00-18:00', '08:00-13:00', '13:00-18:00', '08:00-13:00', '', '', '35', '4')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('36', '14:00-18:00', '14:00-18:00', '08:00-13:00', '14:00-18:00', '08:00-13:00', '', '', '36', '4')");
        jdbcTemplate.update("INSERT INTO work_time(id, day1, day2, day3, day4, day5, day6, day7, person_id, department_id) values ('37', '14:00-18:00', '14:00-18:00', '08:00-13:00', '14:00-18:00', '08:00-13:00', '', '', '36', '4')");


        jdbcTemplate.update("ALTER TABLE \"persons\" ADD CONSTRAINT \"persons_fk1\" FOREIGN KEY (\"department_id\") REFERENCES \"departments\"(\"id\")");
        jdbcTemplate.update("ALTER TABLE \"work_time\" ADD CONSTRAINT \"work_time_fk0\" FOREIGN KEY (\"person_id\") REFERENCES \"persons\"(\"id\")");
        jdbcTemplate.update("ALTER TABLE \"work_time\" ADD CONSTRAINT \"work_time_fk1\" FOREIGN KEY (\"department_id\") REFERENCES \"departments\"(\"id\")");
    }
}
