package lt.asinica.services;

import lt.asinica.beans.Peanut;
import lt.asinica.beans.PeanutList;
import lt.asinica.entities.Person;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

/**
 * Created by p998snc on 2016.02.10.
 */

@RestController
public class PeanutsService {

    private PeanutList peanutList;

    @PostConstruct
    public void init() {
        peanutList = new PeanutList();
        peanutList.addPeanut(new Peanut("Karolis"));
        peanutList.addPeanut(new Peanut("Antanas"));
    }

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public @ResponseBody Person authenticate(@RequestBody final Person person) {
        return new Person();
    }

    @RequestMapping(value = "/peanuts/{name}", method = RequestMethod.PUT)
    public void create(@PathVariable String name) {
        peanutList.addPeanut(new Peanut(name));
    }

    @RequestMapping(value = "/peanuts/{id}", method = RequestMethod.GET)
    public void delete(@PathVariable Long id) {
        Peanut toRemove = null;
        for (Peanut p : peanutList.getPeanuts()) {
            if (p.getId() == id) {
                toRemove = p;
            }
        }

        if (toRemove != null)
            peanutList.getPeanuts().remove(toRemove);

    }

}
