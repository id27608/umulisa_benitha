package id27608.q3;

import java.time.LocalDate;

// ============== CLASS 1: ENTITY ==============
public class Entity {
    protected int id;
    protected LocalDate createdDate;
    protected LocalDate updatedDate;

    public Entity(int id) {
        if (id > 0) {
            this.id = id;
            this.createdDate = LocalDate.now();
            this.updatedDate = LocalDate.now();
        } else {
            throw new IllegalArgumentException("ID must be greater than 0");
        }
    }

    public int getId() {
        return id;
    }

    public LocalDate getCreatedDate() {
        return createdDate;
    }

    public LocalDate getUpdatedDate() {
        return updatedDate;
    }

    @Override
    public String toString() {
        return "Entity{" + "id=" + id + ", createdDate=" + createdDate + ", updatedDate=" + updatedDate + '}';
    }
}
