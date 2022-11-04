package ricardomoraesg.equipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ricardomoraesg.equipes.model.Equipe;
import ricardomoraesg.equipes.service.EquipeService;

@RestController
@RequestMapping("/equipe")
public class EquipeRestController {

    @Autowired
    private EquipeService equipeService;

    @GetMapping
    public ResponseEntity<Iterable<Equipe>> buscarTodos(){
        return ResponseEntity.ok(equipeService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Equipe> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(equipeService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Equipe> inserir(@RequestBody Equipe equipe) {
        equipeService.inserir(equipe);
        return ResponseEntity.ok(equipe);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Equipe> atualizar(@PathVariable Long id, @RequestBody Equipe equipe){
        equipeService.atualizar(id, equipe);
        return ResponseEntity.ok(equipe);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Equipe> deletar(@PathVariable Long id){
        equipeService.deletar(id);
        return ResponseEntity.ok().build();
    }

}
