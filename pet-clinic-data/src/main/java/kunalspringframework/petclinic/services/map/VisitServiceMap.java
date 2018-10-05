package kunalspringframework.petclinic.services.map;

import kunalspringframework.petclinic.model.Visit;
import kunalspringframework.petclinic.services.VisitService;

import java.util.Set;

public class VisitServiceMap extends AbstractMapService<Visit,Long> implements VisitService {
    @Override
    public Set<Visit> findAll() {
        return super.findAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Visit object) {
        super.delete(object);
    }

    @Override
    public Visit save(Visit visit) {
        if(visit.getPet()==null || visit.getPet().getOwner()==null || visit.getPet().getId()==null ||
        visit.getPet().getOwner().getId()==null) {
            throw new RuntimeException("Invalid Visit");
        }
         return super.save(visit);
    }

    @Override
    public Visit findById(Long id) {
        return super.findById(id);
    }
}
