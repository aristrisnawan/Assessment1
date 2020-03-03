package org.d3if4009.bmi


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import org.d3if4009.bmi.databinding.FragmentHasilBinding


// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 *
 */
class hasil : Fragment() {
    private lateinit var binding: FragmentHasilBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_hasil, container, false)

        binding.btnSaran.setOnClickListener {
            it.findNavController().navigate(R.id.action_hasil_to_mengatasiKekurusan)
        }
        binding.btnSaran.setOnClickListener {
            it.findNavController().navigate(R.id.action_hasil_to_menjagaTetapIdeal)
        }
        binding.btnSaran.setOnClickListener {
            it.findNavController().navigate(R.id.action_hasil_to_mengatasiKegemukan)
        }
        return binding.root
    }


}
