package com.example.demo.authorization;


import com.example.demo.pageuser.PageUser;

import javax.annotation.PostConstruct;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.stream.Stream;

@Entity
public class Auth {

    @Id
    private String role;
    private boolean changeValues = false;
    private boolean addCustomer = false;
    private boolean addWorker = false;
    private boolean deleteWorker = false;
    private boolean deleteCustomer = false;

    public Auth() {
    }

    public Auth(String role, boolean changeValues, boolean addCustomer, boolean addWorker, boolean deleteWorker, boolean deleteCustomer) {
        this.role = role;
        this.changeValues = changeValues;
        this.addCustomer = addCustomer;
        this.addWorker = addWorker;
        this.deleteWorker = deleteWorker;
        this.deleteCustomer = deleteCustomer;
    }

    public Auth(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return "Authorization{" +
                "role='" + role + '\'' +
                ", changeValues=" + changeValues +
                ", addCustomer=" + addCustomer +
                ", addWorker=" + addWorker +
                ", deleteWorker=" + deleteWorker +
                ", deleteCustomer=" + deleteCustomer +
                '}';
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public boolean isChangeValues() {
        return changeValues;
    }

    public void setChangeValues(boolean changeValues) {
        this.changeValues = changeValues;
    }

    public boolean isAddCustomer() {
        return addCustomer;
    }

    public void setAddCustomer(boolean addCustomer) {
        this.addCustomer = addCustomer;
    }

    public boolean isAddWorker() {
        return addWorker;
    }

    public void setAddWorker(boolean addWorker) {
        this.addWorker = addWorker;
    }

    public boolean isDeleteWorker() {
        return deleteWorker;
    }

    public void setDeleteWorker(boolean deleteWorker) {
        this.deleteWorker = deleteWorker;
    }

    public boolean isDeleteCustomer() {
        return deleteCustomer;
    }

    public void setDeleteCustomer(boolean deleteCustomer) {
        this.deleteCustomer = deleteCustomer;
    }
}
