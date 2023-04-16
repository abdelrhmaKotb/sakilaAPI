package gov.iti.jets.services.mappers;

import java.util.List;

public interface Mapper <E,D> extends MarkerMapper{
    D toDto(E e);

    E toEntity(D d);

    List<D> mapToDto(List<E> es);

    List<E> mapToEntity(List<D> ds);
}
