using Gym.Models.Equipment;
using Gym.Models.Equipment.Contracts;
using Gym.Repositories.Contracts;
using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Gym.Repositories
{
    public class EquipmentRepository : IRepository<IEquipment>
    {
        private List<IEquipment> models;
        public EquipmentRepository()
        {
            this.models = new List<IEquipment>();
        }
        public IReadOnlyCollection<IEquipment> Models => models;

        public void Add(IEquipment model) => this.models.Add(model);

        public IEquipment FindByType(string type) => this.Models.FirstOrDefault(x => x.GetType().Name == type);

        public bool Remove(IEquipment model) => this.models.Remove(model);
    }
}
