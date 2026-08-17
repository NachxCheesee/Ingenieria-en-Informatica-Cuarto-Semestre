/* ==========================================================================
   LÓGICA PRINCIPAL DEL PORTAFOLIO (app.js)
   ========================================================================== */

// Esperamos a que todo el HTML esté cargado en el navegador antes de ejecutar
document.addEventListener("DOMContentLoaded", () => {
  inicializarModoOscuro();
  inicializarFiltrosProyectos();
  inicializarFormularioContacto();
});

/* --------------------------------------------------------------------------
   1. CONTROL DE TEMA (MODO CLARO / OSCURO)
   -------------------------------------------------------------------------- */
function inicializarModoOscuro() {
  const botonTema = document.getElementById("boton-tema");
  const cuerpoDocumento = document.body;

  // Verificamos si el usuario ya tenía guardada una preferencia en localStorage
  const temaGuardado = localStorage.getItem("preferencia-tema");

  if (temaGuardado === "oscuro") {
    cuerpoDocumento.classList.add("modo-oscuro");
    botonTema.textContent = "☀️ Modo Claro";
  }

  // Evento click para alternar entre temas
  botonTema.addEventListener("click", () => {
    cuerpoDocumento.classList.toggle("modo-oscuro");

    const estaEnModoOscuro = cuerpoDocumento.classList.contains("modo-oscuro");

    if (estaEnModoOscuro) {
      botonTema.textContent = "☀️ Modo Claro";
      localStorage.setItem("preferencia-tema", "oscuro");
    } else {
      botonTema.textContent = "🌙 Modo Oscuro";
      localStorage.setItem("preferencia-tema", "claro");
    }
  });
}

/* --------------------------------------------------------------------------
   2. FILTRADO DINÁMICO DE PROYECTOS
   -------------------------------------------------------------------------- */
function inicializarFiltrosProyectos() {
  const botonesFiltro = document.querySelectorAll(".boton-filtro");
  const listaTarjetasProyectos = document.querySelectorAll(".tarjeta-proyecto");

  botonesFiltro.forEach((botonActual) => {
    botonActual.addEventListener("click", () => {
      // 1. Quitar la clase 'activo' de todos los botones y ponérsela al clickeado
      botonesFiltro.forEach((btn) => btn.classList.remove("activo"));
      botonActual.classList.add("activo");

      // 2. Obtener la categoría seleccionada desde el atributo 'data-categoria'
      const categoriaSeleccionada = botonActual.getAttribute("data-categoria");

      // 3. Mostrar u ocultar las tarjetas correspondientes
      listaTarjetasProyectos.forEach((tarjeta) => {
        const categoriaTarjeta = tarjeta.getAttribute("data-categoria");

        if (categoriaSeleccionada === "todos" || categoriaSeleccionada === categoriaTarjeta) {
          tarjeta.style.display = "block"; // Se muestra
        } else {
          tarjeta.style.display = "none";  // Se oculta
        }
      });
    });
  });
}

/* --------------------------------------------------------------------------
   3. SIMULACIÓN DE ENVÍO DE FORMULARIO
   -------------------------------------------------------------------------- */
function inicializarFormularioContacto() {
  const formularioContacto = document.getElementById("formulario-contacto");
  const mensajeEstado = document.getElementById("mensaje-estado");

  formularioContacto.addEventListener("submit", (evento) => {
    evento.preventDefault(); // Evitamos que la página se recargue automáticamente

    // Obtenemos los valores de los inputs
    const nombreIngresado = document.getElementById("nombre-usuario").value.trim();
    const correoIngresado = document.getElementById("correo-usuario").value.trim();
    const mensajeIngresado = document.getElementById("mensaje-usuario").value.trim();

    // Pequeña validación
    if (!nombreIngresado || !correoIngresado || !mensajeIngresado) {
      mensajeEstado.style.color = "#ef4444";
      mensajeEstado.textContent = "⚠️ Por favor, completa todos los campos requeridos.";
      return;
    }

    // Feedback visual de éxito
    mensajeEstado.style.color = "#10b981";
    mensajeEstado.textContent = `¡Gracias por tu mensaje, ${nombreIngresado}! Me pondré en contacto contigo pronto.`;

    // Limpiamos el formulario
    formularioContacto.reset();
  });
}