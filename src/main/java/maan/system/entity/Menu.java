package maan.system.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Table
@Entity(name = "menu")
@Getter
@Setter
public class Menu implements Serializable {
    @Serial
    private static final long serialVersionUID = -2653589905782928171L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String path;

    @Column(nullable = true)
    private String icon;

    @JoinColumn(name = "parent_menu_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Menu subMenu;
}
