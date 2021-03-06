/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author kose_
 */
@Entity
@Table(name = "tipoconcepto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Tipoconcepto.findAll", query = "SELECT t FROM Tipoconcepto t")
    , @NamedQuery(name = "Tipoconcepto.findById", query = "SELECT t FROM Tipoconcepto t WHERE t.id = :id")
    , @NamedQuery(name = "Tipoconcepto.findByDescripcion", query = "SELECT t FROM Tipoconcepto t WHERE t.descripcion = :descripcion")})
public class Tipoconcepto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(mappedBy = "tipo")
    private List<Concepto> conceptoList;

    public Tipoconcepto() {
    }

    public Tipoconcepto(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public List<Concepto> getConceptoList() {
        return conceptoList;
    }

    public void setConceptoList(List<Concepto> conceptoList) {
        this.conceptoList = conceptoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tipoconcepto)) {
            return false;
        }
        Tipoconcepto other = (Tipoconcepto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "DTO.Tipoconcepto[ id=" + id + " ]";
    }
    
}
