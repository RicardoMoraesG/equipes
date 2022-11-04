package ricardomoraesg.equipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ricardomoraesg.equipes.model.Funcao;
import ricardomoraesg.equipes.service.FuncaoService;

@RestController
@RequestMapping("/funcao")
public class FuncaoRestController {

    @Autowired
    private FuncaoService funcaoService;

    @GetMapping
    public ResponseEntity<Iterable<Funcao>> buscarTodos(){
        return ResponseEntity.ok(funcaoService.buscarTodos());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcao> buscarPorId(@PathVariable String id) {
        return ResponseEntity.ok(funcaoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Funcao> inserir(@RequestBody Funcao funcao) {
        funcaoService.inserir(funcao);
        return ResponseEntity.ok(funcao);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Funcao> atualizar(@PathVariable String id, @RequestBody Funcao funcao){
        funcaoService.atualizar(id, funcao);
        return ResponseEntity.ok(funcao);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Funcao> deletar(@PathVariable String id){
        funcaoService.deletar(id);
        return ResponseEntity.ok().build();
    }
}
