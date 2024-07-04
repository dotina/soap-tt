//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package org.lesson.springsoapeg.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(
        name = "",
        propOrder = {"addResult"}
)
@XmlRootElement(
        name = "AddResponse"
)
public class AddResponse {
    @XmlElement(
            name = "AddResult"
    )
    protected int addResult;

    public AddResponse() {
    }

    public int getAddResult() {
        return this.addResult;
    }

    public void setAddResult(int value) {
        this.addResult = value;
    }
}
