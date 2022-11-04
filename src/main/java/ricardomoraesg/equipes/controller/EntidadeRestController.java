package ricardomoraesg.equipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ricardomoraesg.equipes.model.Entidade;
import ricardomoraesg.equipes.service.EntidadeService;

@RestController
@RequestMapping("/entidade")
public class EntidadeRestController {


    @Autowired
    private EntidadeService entidadeService;

    @GetMapping
    public ResponseEntity<Iterable<Entidade>> buscarTodos(){
        return ResponseEntity.ok(entidadeService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Entidade> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(entidadeService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Entidade> inserir(@RequestBody Entidade entidade) {
        entidadeService.inserir(entidade);
        return ResponseEntity.ok(entidade);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Entidade> atualizar(@PathVariable Long id, @RequestBody Entidade entidade){
        entidadeService.atualizar(id, entidade);
        return ResponseEntity.ok(entidade);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Entidade> deletar(@PathVariable Long id){
        entidadeService.deletar(id);
        return ResponseEntity.ok().build();
    }

}
