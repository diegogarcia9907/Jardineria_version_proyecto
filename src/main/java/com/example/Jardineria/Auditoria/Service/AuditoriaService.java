package com.example.Jardineria.Auditoria.Service;
@Service
public class AuditoriaService {

    private static AuditoriaService instancia;

    // Constructor privado para evitar la instanciación directa
    private AuditoriaService() {
    }

    // Método estático para obtener la instancia única del servicio
    public static synchronized AuditoriaService getInstance() {
        if (instancia == null) {
            instancia = new AuditoriaService();
        }
        return instancia;
    }

    @Value("${log.error.filepath}")
    private String errorLogFilePath;

    // Método para registrar errores
    public void registrarError(String mensaje) {
        try {
            FileWriter fileWriter = new FileWriter(errorLogFilePath, true); // true para agregar al archivo existente
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println("Error: " + mensaje);
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            // Manejar el error de escritura del archivo aquí
 }}
}