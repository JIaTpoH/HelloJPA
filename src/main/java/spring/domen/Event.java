package spring.domen;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/*
Создание таблицы
CREATE TABLE event (
   id SERIAL PRIMARY KEY,
   name TEXT NOT NULL,
   city TEXT NOT NULL
   );
 */
@Setter
@Getter
@NoArgsConstructor

@Entity
public class Event {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private  String city;

  public Event(Integer id) {
    this.id = id;
  }
}
