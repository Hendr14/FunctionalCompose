package id.ac.unpas.functionalcompose.model

import androidx.room.Entity
import androidx.room.PrimaryKey
@Entity
data class SetoranSampah(
    @PrimaryKey val id: String,
    val namalengkap: String,
    val  tanggallahir: String,
    val Alamatlengkap: String,
    val Notelephone: String
)
