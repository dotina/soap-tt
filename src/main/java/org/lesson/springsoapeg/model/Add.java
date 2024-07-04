package org.lesson.springsoapeg.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"intA", "intB"}
)
@XmlRootElement(
        name = "Add"
)
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Add {
    protected int intA;
    protected int intB;

}
