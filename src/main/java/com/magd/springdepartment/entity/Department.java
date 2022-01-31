package com.magd.springdepartment.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import java.util.Objects;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Getter
@Setter
@RequiredArgsConstructor
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long departmentId;
    //@Past
    //@PastOrPresent
   //@NegativeOrZero
   //@NegativeOrZero
   //@FutureOrPresent
//        ...
//    @Length(min = 3, max = 25)
//    @Size(min = 1, max = 25)
//    @Email
//    @Positive
    @NotBlank(message = "Please Enter Department Name")
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Department that = (Department) o;
        return departmentId != null && Objects.equals(departmentId, that.departmentId);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
