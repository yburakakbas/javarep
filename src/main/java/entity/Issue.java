package entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "issue")
@Data //getter ve setter yaratır otomatik
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class Issue extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "description" ,  length = 1000)
    private String description;

    @Column(name = "details", length = 4000)
    private Date details;

    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "description")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @JoinColumn(name = "assignee_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY) //birçok issue class bir tane user a bağlanabilir.optional: atama omasa da olur. lazy:istenildği zaman mı select yapılsın yoksa herzaman mı.
    private User assignee;

}
