package entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "issue")
public class Issue extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "description" , )
    private String description;
    private Date date;
    private IssueStatus issueStatus;


}
