package ricardomoraesg.equipes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ricardomoraesg.equipes.model.Certificado;
import ricardomoraesg.equipes.service.CertificadoService;
@RestController
@RequestMapping("/certificado")
public class CertificadoRestController {
    @Autowired
    private CertificadoService certificadoService;

    @GetMapping
    public ResponseEntity<Iterable<Certificado>> buscarTodos(){
        return ResponseEntity.ok(certificadoService.buscarTodos());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Certificado> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(certificadoService.buscarPorId(id));
    }

    @PostMapping
    public ResponseEntity<Certificado> inserir(@RequestBody Certificado certificado) {
        certificadoService.inserir(certificado);
        return ResponseEntity.ok(certificado);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Certificado> atualizar(@PathVariable Long id, @RequestBody Certificado certificado){
        certificadoService.atualizar(id, certificado);
        return ResponseEntity.ok(certificado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Certificado> deletar(@PathVariable Long id){
        certificadoService.deletar(id);
        return ResponseEntity.ok().build();
    }


}
