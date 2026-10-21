package com.example.EcoQuest.Message

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import com.example.EcoQuest.databinding.FragmentMessageBinding

class MessageFragment : Fragment() {

    private var _binding: FragmentMessageBinding? = null
    private val binding get() = _binding!!

    // Mengganti isi data pesan dengan Challenge Lingkungan
    private val challengeList = listOf(
        MessageModel("🌱 Bawa Tumbler Sendiri", "Gunakan tempat minum pribadi hari ini.", "https://api.dicebear.com/7.x/bottts/svg?seed=Botol"),
        MessageModel("🛍️ Belanja Tanpa Plastik", "Gunakan tas belanja ramah lingkungan.", "https://api.dicebear.com/7.x/bottts/svg?seed=Tas"),
        MessageModel("💡 Hemat Energi Listrik", "Matikan lampu dan cabut charger tidak terpakai.", "https://api.dicebear.com/7.x/bottts/svg?seed=Lampu"),
        MessageModel("🚲 Transportasi Hijau", "Jalan kaki, bersepeda, atau naik angkutan umum.", "https://api.dicebear.com/7.x/bottts/svg?seed=Sepeda"),
        MessageModel("♻️ Pemilahan Sampah", "Pisahkan sampah organik dan anorganik di rumah.", "https://api.dicebear.com/7.x/bottts/svg?seed=Sampah"),
        MessageModel("🍲 Habiskan Makanan", "Ambil porsi secukupnya dan hindari food waste.", "https://api.dicebear.com/7.x/bottts/svg?seed=Makanan"),
        MessageModel("🪴 Siram & Tanam Pohon", "Beri perawatan pada tanaman di sekitarmu.", "https://api.dicebear.com/7.x/bottts/svg?seed=Pohon"),
        MessageModel("📄 Hemat Kertas", "Gunakan dokumen digital untuk mencatat.", "https://api.dicebear.com/7.x/bottts/svg?seed=Kertas")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMessageBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (requireActivity() as AppCompatActivity).setSupportActionBar(binding.toolbar)
        (requireActivity() as AppCompatActivity).supportActionBar?.title = "Challenge"

        val adapter = MessageAdapter(requireContext(), challengeList)
        binding.ListMessageItem.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}