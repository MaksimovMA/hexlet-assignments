package exercise.model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.EntityListeners;
import static jakarta.persistence.GenerationType.IDENTITY;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;

// BEGIN
@Entity
@Table(name = "task")
@EntityListeners(AuditingEntityListener.class)
@Getter
@Setter
public class Task {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private long id;

    private String title;
    private String description;

    @LastModifiedDate
    private LocalDate updatedAt;

    @CreatedDate
    private LocalDate createdAt;

}
// END



//Создайте модель Task, которая будет представлять задачу в нашем приложении. У модели есть следующие поля:
//
//id – уникальный идентификатор id, генерируется автоматически базой данных
//title — название задачи
//description – описание задачи
//createdAt – дата создания новой задачи
//updatedAt – дата последнего обновления задачи
//Поля createdAt и updatedAt должны заполняться автоматически.