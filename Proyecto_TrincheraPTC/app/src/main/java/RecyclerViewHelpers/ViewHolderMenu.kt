package RecyclerViewHelpers

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import equipo.ptc.proyecto_trincheraptc.R

class ViewHolderMenu(view: View): RecyclerView.ViewHolder(view) {
    val tvNombreCategoria = view.findViewById<TextView>(R.id.tvNombreCategoria)
    val imageView = view.findViewById<ImageView>(R.id.ivImagenProducto)
}