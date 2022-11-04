package ricardomoraesg.equipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ricardomoraesg.equipes.model.Medalha;
import ricardomoraesg.equipes.service.MedalhaService;

@RestController
@RequestMapping("/medalha")
public class MedalhaRestController {
    @Autowired
    private MedalhaService medalhaService;

    @GetMapping
    public ResponseEntity<Iterable<Medalha>> buscarTodos(){
        return ResponseEntity.ok(medalhaService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Medalha> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(medalhaService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Medalha> inserir(@RequestBody Medalha medalha) {
        medalhaService.inserir(medalha);
        return ResponseEntity.ok(medalha);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Medalha> atualizar(@PathVariable Long id, @RequestBody Medalha medalha){
        medalhaService.atualizar(id, medalha);
        return ResponseEntity.ok(medalha);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Medalha> deletar(@PathVariable Long id){
        medalhaService.deletar(id);
        return ResponseEntity.ok().build();
    }

}
