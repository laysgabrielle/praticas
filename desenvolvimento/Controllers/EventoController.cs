using Microsoft.AspNetCore.Mvc;

public class EventoController : Controller
{
    public IActionResult Create() => View();

    [HttpPost]
    [ValidateAntiForgeryToken]
    public IActionResult Salvar(EventoViewModel info)
    {
        if (!ModelState.IsValid)
            return View("Create", info);

        ViewData["Mensagem"] = info.NumeroParticipantes > 100
            ? "Evento de grande porte"
            : "Evento cadastrado com sucesso";

        return View("Resultado", info);
    }
}
