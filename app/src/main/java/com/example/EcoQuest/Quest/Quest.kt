package com.example.EcoQuest.Quest

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.EcoQuest.databinding.FragmentQuestBinding

class Quest : Fragment() {

    private var _binding: FragmentQuestBinding? = null
    private val binding get() = _binding!!

    // Data Quest / Challenge Lingkungan
    private val challengeList = listOf(
        QuestModel("🌱 Bawa Tumbler Sendiri", "Gunakan tempat minum pribadi hari ini.", "https://api.dicebear.com/7.x/bottts/svg?seed=Botol"),
        QuestModel("🛍️ Belanja Tanpa Plastik", "Gunakan tas belanja ramah lingkungan.", "https://api.dicebear.com/7.x/bottts/svg?seed=Tas"),
        QuestModel("💡 Hemat Energi Listrik", "Matikan lampu dan cabut charger tidak terpakai.", "https://api.dicebear.com/7.x/bottts/svg?seed=Lampu"),
        QuestModel("🚲 Transportasi Hijau", "Jalan kaki, bersepeda, atau naik angkutan umum.", "https://api.dicebear.com/7.x/bottts/svg?seed=Sepeda"),
        QuestModel("♻️ Pemilahan Sampah", "Pisahkan sampah organik dan anorganik di rumah.", "https://api.dicebear.com/7.x/bottts/svg?seed=Sampah"),
        QuestModel("🍲 Habiskan Makanan", "Ambil porsi secukupnya dan hindari food waste.", "https://api.dicebear.com/7.x/bottts/svg?seed=Makanan"),
        QuestModel("🪴 Siram & Tanam Pohon", "Beri perawatan pada tanaman di sekitarmu.", "https://api.dicebear.com/7.x/bottts/svg?seed=Pohon"),
        QuestModel("📄 Hemat Kertas", "Gunakan dokumen digital untuk mencatat.", "https://api.dicebear.com/7.x/bottts/svg?seed=Kertas")
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentQuestBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = QuestAdapter(requireContext(), challengeList)
        binding.ListMessageItem.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}