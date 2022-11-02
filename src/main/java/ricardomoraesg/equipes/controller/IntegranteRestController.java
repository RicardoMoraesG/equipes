package ricardomoraesg.equipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ricardomoraesg.equipes.model.Integrante;
import ricardomoraesg.equipes.service.IntegranteService;

@RequestMapping("/integrante")
@RestController
public class IntegranteRestController {
    @Autowired
    private IntegranteService integranteService;

    @GetMapping
    public ResponseEntity<Iterable<Integrante>> buscarTodos(){
        return ResponseEntity.ok(integranteService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Integrante> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(integranteService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Integrante> inserir(@RequestBody Integrante integrante) {
        integranteService.inserir(integrante);
        return ResponseEntity.ok(integrante);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Integrante> atualizar(@PathVariable Long id, @RequestBody Integrante integrante){
        integranteService.atualizar(id, integrante);
        return ResponseEntity.ok(integrante);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Integrante> deletar(@PathVariable Long id){
        integranteService.deletar(id);
        return ResponseEntity.ok().build();
    }



}
