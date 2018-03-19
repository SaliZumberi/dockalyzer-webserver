package ch.uzh.seals.dockalyzerwebserver.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class ProjectDTO {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;
}
