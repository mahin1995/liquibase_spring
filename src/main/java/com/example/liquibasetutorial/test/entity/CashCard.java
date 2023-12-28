package com.example.liquibasetutorial.test.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Setter
@Getter
@Entity
public final class CashCard {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Double amount;

    private String owner;

    public CashCard() {
        this.id = null;
        this.amount = null;
        this.owner = null;
    }

    public CashCard(Long id, Double amount, String owner) {
        this.id = id;
        this.amount = amount;
        this.owner = owner;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (CashCard) obj;
        return Objects.equals(this.id, that.id) &&
                Objects.equals(this.amount, that.amount) &&
                Objects.equals(this.owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, amount, owner);
    }

    @Override
    public String toString() {
        return "CashCard[" +
                "id=" + id + ", " +
                "amount=" + amount + ", " +
                "owner=" + owner + ']';
    }

}