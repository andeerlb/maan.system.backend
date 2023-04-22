package maan.system.service;

import maan.system.entity.Menu;
import maan.system.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {

    @Autowired
    private MenuRepository repository;

    public List<Menu> getAll() {
        return repository.findAll();
    }
}
