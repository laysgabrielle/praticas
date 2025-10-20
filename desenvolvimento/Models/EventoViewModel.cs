using System;
using System.ComponentModel.DataAnnotations;

public class EventoViewModel
{
    [Required, StringLength(50)]
    public string Nome { get; set; }

    [Required, Range(1, int.MaxValue)]
    public int NumeroParticipantes { get; set; }

    [Required, DataType(DataType.Date)]
    [CustomValidation(typeof(EventoViewModel), nameof(ValidarData))]
    public DateTime Data { get; set; }

    [Required]
    public bool Ativo { get; set; }

    public static ValidationResult ValidarData(DateTime data, ValidationContext context)
    {
        return data >= DateTime.Today
            ? ValidationResult.Success
            : new ValidationResult("A data não pode ser no passado.");
    }
}
