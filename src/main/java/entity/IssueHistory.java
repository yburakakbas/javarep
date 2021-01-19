package entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "issue")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode

public class IssueHistory extends BaseEntity {

    private long id;
    private Issue issue;

    @JoinColumn(name = "assignee_user_id")
    @ManyToOne (optional = true, fetch = FetchType.LAZY)
    private  User assignee;
}
