package com.example.Fallapp.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("fallas")
public class Falla {

    @Id
    private String id;
    private Long objectid;
    private Long idFalla;
    private String nombre;
    private String seccion;
    private String fallera;
    private String presidente;
    private String artistaNombre;
    private String lema;
    private Integer anyoFundacion;
    private String distintivo;
    private String boceto;
    private Integer experim;
    private Double lon;
    private Double lat;

    // Relación ManyToOne con Artista (por id)
    private String artistaId;

    public Falla() {
    }

    public Falla(Long objectid,
                 Long idFalla,
                 String nombre,
                 String seccion,
                 String fallera,
                 String presidente,
                 String artistaNombre,
                 String lema,
                 Integer anyoFundacion,
                 String distintivo,
                 String boceto,
                 Integer experim,
                 Double lon,
                 Double lat,
                 String artistaId) {
        this.objectid = objectid;
        this.idFalla = idFalla;
        this.nombre = nombre;
        this.seccion = seccion;
        this.fallera = fallera;
        this.presidente = presidente;
        this.artistaNombre = artistaNombre;
        this.lema = lema;
        this.anyoFundacion = anyoFundacion;
        this.distintivo = distintivo;
        this.boceto = boceto;
        this.experim = experim;
        this.lon = lon;
        this.lat = lat;
        this.artistaId = artistaId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getObjectid() {
        return objectid;
    }

    public void setObjectid(Long objectid) {
        this.objectid = objectid;
    }

    public Long getIdFalla() {
        return idFalla;
    }

    public void setIdFalla(Long idFalla) {
        this.idFalla = idFalla;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getFallera() {
        return fallera;
    }

    public void setFallera(String fallera) {
        this.fallera = fallera;
    }

    public String getPresidente() {
        return presidente;
    }

    public void setPresidente(String presidente) {
        this.presidente = presidente;
    }

    public String getArtistaNombre() {
        return artistaNombre;
    }

    public void setArtistaNombre(String artistaNombre) {
        this.artistaNombre = artistaNombre;
    }

    public String getLema() {
        return lema;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public Integer getAnyoFundacion() {
        return anyoFundacion;
    }

    public void setAnyoFundacion(Integer anyoFundacion) {
        this.anyoFundacion = anyoFundacion;
    }

    public String getDistintivo() {
        return distintivo;
    }

    public void setDistintivo(String distintivo) {
        this.distintivo = distintivo;
    }

    public String getBoceto() {
        return boceto;
    }

    public void setBoceto(String boceto) {
        this.boceto = boceto;
    }

    public Integer getExperim() {
        return experim;
    }

    public void setExperim(Integer experim) {
        this.experim = experim;
    }

    public Double getLon() {
        return lon;
    }

    public void setLon(Double lon) {
        this.lon = lon;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public String getArtistaId() {
        return artistaId;
    }

    public void setArtistaId(String artistaId) {
        this.artistaId = artistaId;
    }
}

