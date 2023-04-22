package maan.system.controller;

import maan.system.entity.Menu;
import maan.system.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenuController {

    @Autowired
    private MenuService service;

    @GetMapping("/all")
    public ResponseEntity<List<Menu>> getAll() {
        return ResponseEntity.ok(service.getAll());
    }
}
