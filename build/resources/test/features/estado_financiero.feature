#language: es

Característica: Generar estado finaciero

  Escenario: Genera informe del estado financiero
    Dado Damian esta en la pagina de la aerocivil
    Cuando genera el informe del estado financiero
    Entonces debera validar que se genero el archivo 'https://www.aerocivil.gov.co/atencion/presupuesto/Estados%20Financieros/Estado%20de%20Situaci%C3%B3n%20Financiera%20a%2030%20de%20septiembre%20de%202021.pdf'