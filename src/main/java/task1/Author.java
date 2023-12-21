/** Cтворіть у циклі 200 об'єктів author і збережіть у БД.
 * Значення полів можуть бути будь-якими.
 * Використовуйте метод flush для кожних 10 об'єктів. Метод сommit виконайте один раз, наприкінці.
 */

package task1;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
@ToString
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    int id;
    @Column(length =20) //VARCHAR
    String name;
}
