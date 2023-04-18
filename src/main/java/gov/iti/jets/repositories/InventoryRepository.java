package gov.iti.jets.repositories;

import java.util.List;

import gov.iti.jets.repositories.entities.Inventory;

public class InventoryRepository extends RepositoryImpl<Inventory, Integer> {

    public InventoryRepository(){
        super(Inventory.class);
    }

    public List<Inventory> getAllInventories() {
        var res = this.<Inventory>query(
                """
                        SELECT i FROM Inventory i
                            join fetch i.film f
                            join fetch i.store s
                            join fetch s.managerStaff ms
                            join fetch f.language
                        """,1);
        return res;
    }

}
