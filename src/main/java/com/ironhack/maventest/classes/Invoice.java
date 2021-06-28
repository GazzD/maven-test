package com.ironhack.maventest.classes;

import java.math.BigDecimal;
import java.util.List;

public class Invoice {
    private String id;
    private BigDecimal total;
    private boolean isPaid;
    private List<InvoiceItem> items;

    public Invoice(String id, BigDecimal total, boolean isPaid, List<InvoiceItem> items) {
        this.id = id;
        this.total = total;
        this.isPaid = isPaid;
        this.items = items;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    public boolean isPaid() {
        return isPaid;
    }

    public void setPaid(boolean paid) {
        isPaid = paid;
    }

    public List<InvoiceItem> getItems() {
        return items;
    }

    public void setItems(List<InvoiceItem> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "id='" + id + '\'' +
                ", total=" + total +
                ", isPaid=" + isPaid +
                ", items=" + items +
                '}';
    }
}
